sample
===
* 注释

	select #use("cols")# from ra_member  where  #use("condition")#

cols
===
	member_id,member_name,member_truename,member_avatar,member_sex,member_birthday,member_passwd,member_paypwd,member_email,member_email_bind,member_mobile,member_mobile_bind,member_qq,member_ww,member_login_num,member_time,member_login_time,member_old_login_time,member_login_ip,member_old_login_ip,member_qqopenid,member_qqinfo,member_sinaopenid,member_sinainfo,member_points,available_predeposit,freeze_predeposit,available_rc_balance,freeze_rc_balance,inform_allow,is_buy,is_allowtalk,member_state,member_snsvisitnum,member_areaid,member_cityid,member_provinceid,member_areainfo,member_privacy,member_quicklink,member_exppoints,proxy_id,zpic,fpic,idcard,wechat_openid,mini_wechat_openid,nickname,allow_push,is_whole,storeDress

updateSample
===
	
	member_id=#memberId#,member_name=#memberName#,member_truename=#memberTruename#,member_avatar=#memberAvatar#,member_sex=#memberSex#,member_birthday=#memberBirthday#,member_passwd=#memberPasswd#,member_paypwd=#memberPaypwd#,member_email=#memberEmail#,member_email_bind=#memberEmailBind#,member_mobile=#memberMobile#,member_mobile_bind=#memberMobileBind#,member_qq=#memberQq#,member_ww=#memberWw#,member_login_num=#memberLoginNum#,member_time=#memberTime#,member_login_time=#memberLoginTime#,member_old_login_time=#memberOldLoginTime#,member_login_ip=#memberLoginIp#,member_old_login_ip=#memberOldLoginIp#,member_qqopenid=#memberQqopenid#,member_qqinfo=#memberQqinfo#,member_sinaopenid=#memberSinaopenid#,member_sinainfo=#memberSinainfo#,member_points=#memberPoints#,available_predeposit=#availablePredeposit#,freeze_predeposit=#freezePredeposit#,available_rc_balance=#availableRcBalance#,freeze_rc_balance=#freezeRcBalance#,inform_allow=#informAllow#,is_buy=#isBuy#,is_allowtalk=#isAllowtalk#,member_state=#memberState#,member_snsvisitnum=#memberSnsvisitnum#,member_areaid=#memberAreaid#,member_cityid=#memberCityid#,member_provinceid=#memberProvinceid#,member_areainfo=#memberAreainfo#,member_privacy=#memberPrivacy#,member_quicklink=#memberQuicklink#,member_exppoints=#memberExppoints#,proxy_id=#proxyId#,zpic=#zpic#,fpic=#fpic#,idcard=#idcard#,wechat_openid=#wechatOpenid#,mini_wechat_openid=#miniWechatOpenid#,nickname=#nickname#,allow_push=#allowPush#,is_whole=#isWhole#,storeDress=#storedress#

condition
===

	1 = 1  
	@if(!isEmpty(memberId)){
	 and member_id=#memberId#
	@}
	@if(!isEmpty(memberName)){
	 and member_name=#memberName#
	@}
	@if(!isEmpty(memberTruename)){
	 and member_truename=#memberTruename#
	@}
	@if(!isEmpty(memberAvatar)){
	 and member_avatar=#memberAvatar#
	@}
	@if(!isEmpty(memberSex)){
	 and member_sex=#memberSex#
	@}
	@if(!isEmpty(memberBirthday)){
	 and member_birthday=#memberBirthday#
	@}
	@if(!isEmpty(memberPasswd)){
	 and member_passwd=#memberPasswd#
	@}
	@if(!isEmpty(memberPaypwd)){
	 and member_paypwd=#memberPaypwd#
	@}
	@if(!isEmpty(memberEmail)){
	 and member_email=#memberEmail#
	@}
	@if(!isEmpty(memberEmailBind)){
	 and member_email_bind=#memberEmailBind#
	@}
	@if(!isEmpty(memberMobile)){
	 and member_mobile=#memberMobile#
	@}
	@if(!isEmpty(memberMobileBind)){
	 and member_mobile_bind=#memberMobileBind#
	@}
	@if(!isEmpty(memberQq)){
	 and member_qq=#memberQq#
	@}
	@if(!isEmpty(memberWw)){
	 and member_ww=#memberWw#
	@}
	@if(!isEmpty(memberLoginNum)){
	 and member_login_num=#memberLoginNum#
	@}
	@if(!isEmpty(memberTime)){
	 and member_time=#memberTime#
	@}
	@if(!isEmpty(memberLoginTime)){
	 and member_login_time=#memberLoginTime#
	@}
	@if(!isEmpty(memberOldLoginTime)){
	 and member_old_login_time=#memberOldLoginTime#
	@}
	@if(!isEmpty(memberLoginIp)){
	 and member_login_ip=#memberLoginIp#
	@}
	@if(!isEmpty(memberOldLoginIp)){
	 and member_old_login_ip=#memberOldLoginIp#
	@}
	@if(!isEmpty(memberQqopenid)){
	 and member_qqopenid=#memberQqopenid#
	@}
	@if(!isEmpty(memberQqinfo)){
	 and member_qqinfo=#memberQqinfo#
	@}
	@if(!isEmpty(memberSinaopenid)){
	 and member_sinaopenid=#memberSinaopenid#
	@}
	@if(!isEmpty(memberSinainfo)){
	 and member_sinainfo=#memberSinainfo#
	@}
	@if(!isEmpty(memberPoints)){
	 and member_points=#memberPoints#
	@}
	@if(!isEmpty(availablePredeposit)){
	 and available_predeposit=#availablePredeposit#
	@}
	@if(!isEmpty(freezePredeposit)){
	 and freeze_predeposit=#freezePredeposit#
	@}
	@if(!isEmpty(availableRcBalance)){
	 and available_rc_balance=#availableRcBalance#
	@}
	@if(!isEmpty(freezeRcBalance)){
	 and freeze_rc_balance=#freezeRcBalance#
	@}
	@if(!isEmpty(informAllow)){
	 and inform_allow=#informAllow#
	@}
	@if(!isEmpty(isBuy)){
	 and is_buy=#isBuy#
	@}
	@if(!isEmpty(isAllowtalk)){
	 and is_allowtalk=#isAllowtalk#
	@}
	@if(!isEmpty(memberState)){
	 and member_state=#memberState#
	@}
	@if(!isEmpty(memberSnsvisitnum)){
	 and member_snsvisitnum=#memberSnsvisitnum#
	@}
	@if(!isEmpty(memberAreaid)){
	 and member_areaid=#memberAreaid#
	@}
	@if(!isEmpty(memberCityid)){
	 and member_cityid=#memberCityid#
	@}
	@if(!isEmpty(memberProvinceid)){
	 and member_provinceid=#memberProvinceid#
	@}
	@if(!isEmpty(memberAreainfo)){
	 and member_areainfo=#memberAreainfo#
	@}
	@if(!isEmpty(memberPrivacy)){
	 and member_privacy=#memberPrivacy#
	@}
	@if(!isEmpty(memberQuicklink)){
	 and member_quicklink=#memberQuicklink#
	@}
	@if(!isEmpty(memberExppoints)){
	 and member_exppoints=#memberExppoints#
	@}
	@if(!isEmpty(proxyId)){
	 and proxy_id=#proxyId#
	@}
	@if(!isEmpty(zpic)){
	 and zpic=#zpic#
	@}
	@if(!isEmpty(fpic)){
	 and fpic=#fpic#
	@}
	@if(!isEmpty(idcard)){
	 and idcard=#idcard#
	@}
	@if(!isEmpty(wechatOpenid)){
	 and wechat_openid=#wechatOpenid#
	@}
	@if(!isEmpty(miniWechatOpenid)){
	 and mini_wechat_openid=#miniWechatOpenid#
	@}
	@if(!isEmpty(nickname)){
	 and nickname=#nickname#
	@}
	@if(!isEmpty(allowPush)){
	 and allow_push=#allowPush#
	@}
	@if(!isEmpty(isWhole)){
	 and is_whole=#isWhole#
	@}
	@if(!isEmpty(storedress)){
	 and storeDress=#storedress#
	@}
	
	