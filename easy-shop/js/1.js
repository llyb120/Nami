// var fn = global.require;
// // console.log(global)
// global.require = function (module) {
//     // console.log(module)
//     // console.log("require: ", module, require.resolve(module))
//     delete fn.cache[fn.resolve(module)];
//     return fn(module)
// };


global.DEV = true
//
// const fs = require("fs")
// //
// // fs.readFile('D:\\work\\easyshop\\easy-shop\\js\\1.js', 'utf8', function (err, data) {
// //     console.log(data);
// // });
// //
// const vm = require('vm');
//
// // for(var i = 0; i < 1000; i++){
// //     setTimeout(() => {
// //         eval("require('./2.js')");
// //     },1000 * i);
// //     console.log(i)
// // }
//
// var http = require('http');
//
// http.createServer(async function (request, response) {
//
//     // 发送 HTTP 头部
//     // HTTP 状态值: 200 : OK
//     // 内容类型: text/plain
//     if(request && request.url == "/favicon.ico") return response.end()
//     console.log(request.url)
//     response.writeHead(200, {'Content-Type': 'text/plain'});
//     response.end("hello world" + require("./2.js").a);
//
//     var fun = (a,b,c) => {
//         console.log(a + "$$$");
//         console.log(b + "$$$");
//         console.log(c + "$$$");
//     }
//     fun(...require("./2.js").a)
//
//     return
//     // var script = new vm.Script("const a = require('./2.js'); console.log(a)");
//     // script.runInNewContext({});
//     // eval("const a = require('./2.js'); ")
//     //
//     // response.end();
//     // return;
//
//
//     const fs = require('fs')
//     const NativeModule = require('module')
//     const vm = require('vm')
//     const util = require('util')
//
//     fs.readFile = util.promisify(fs.readFile)
//
//
//     const bundle = await fs.readFile('./js/2.js', 'utf-8') //此时的bundle为String
//     // vm.runInThisContext(bundle);
//
//     const getModuleFromString = (bundle, filename) => {
//         const m = { exports: {} }
//         // vm.createContext();
//         const wrapper = NativeModule.wrap(bundle)
//         const script = new vm.Script(wrapper, {
//             filename,
//             displayErrors: true
//         })
//         const result = script.runInThisContext(m) // 此处可以指定代码的执行环境，此api在nodejs文档中有介绍
//         console.log(result)
//         result.call(m.exports, m.exports, require, m) // 执行wrapper函数，此处传入require就解决了第一种方法不能require的问题
//         return m
//     }
//
//     const m = getModuleFromString(bundle, 'bundle.js')
//
//
//     // 发送响应数据 "Hello World"
//     response.end('Hello World\n');
// }).listen(8888);
//
// process.setMaxListeners(0);
//
// // 终端打印如下信息
// console.log('Server running at http://127.0.0.1:8888/');


    const net = require("net")
    var client = null;

    function writeData(socket,data){
        const len = Buffer.byteLength(data,"utf-8");
        const buf = Buffer.alloc(4 + len);
        buf.writeInt32BE(len)
        buf.write(data, 4, "utf-8")
        // buf.copy(len, 4);
        var success=!socket.write(buf);
        if(!success){
            (function (socket,data){
                socket.once('drain',function(){
                    console.log("drain")
                    writeData(socket,data);
                });
            })(socket,data);
        }
    }

    function reconnect() {
        if(client != null) {
            return
        }
        client = net.connect(6380);
        //永不超时
        client.setTimeout(2147483647)
        client.setEncoding("utf-8")
        client.on("connect", () => {
            for(var i = 0; i < 1000; i++){
                writeData(client, "rilegou")
            }
            console.log("connected")
        });

        client.on("data", data => {
            console.log(data.toString())
        });

        client.on("error", err => {
            console.log("error")
            client = null;
            reconnect()
        });

        client.on("close", () => {
            client = null;
            reconnect()
        });

        client.on("timeout", () => {
            client = null;
            reconnect()
        });
    }

    reconnect();


// const sandboxes = [{}, {}, {}];
// sandboxes.forEach((sandbox) => {
//     script.runInNewContext(sandbox);
// });
//
// console.log(sandboxes)
// console.log(123321)