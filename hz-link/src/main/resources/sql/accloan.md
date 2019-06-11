04
===
select
p1.LOAN_ACCOUNT,
g6.GUARANTY_ID,
g1.GUAR_NO,
g1.GUAR_NAME,
g1.CER_TYPE,
g1.CER_NO,
g6.GAGE_NAME,
p1.cus_id and g1.guar_no = #guar_no#
 as cus_id,
case

when p1.ASSURE_MEANS_MAIN = '10' then

g3.CORE_VALUE

when p1.ASSURE_MEANS_MAIN = '20' then

g4.CORE_VALUE

when p1.ASSURE_MEANS_MAIN = '30' then

'0'

end as CORE_VALUE
from
RPT_M_RPT_SLS_ACCT as p1
left join  GRT_LOANGUAR_INFO as g5 on g5.CONT_NO=p1.CONT_NO
left join GRT_GUAR_CONT as g1 on g5.GUAR_CONT_NO=g1.GUAR_CONT_NO
left join GRT_GUARANTY_RE as g6 on g6.GUAR_CONT_NO=g5.GUAR_CONT_NO
left join GRT_G_BASIC_INFO as g3 on g3.GUARANTY_ID=g6.GUARANTY_ID
left join GRT_P_BASIC_INFO as g4 on g4.GUARANTY_ID=g6.GUARANTY_ID
left join GRT_GUARANTEER as g2 on g2.GUARANTY_ID=g6.GUARANTY_ID
where 
1 = 1
    and p1.LOAN_ACCOUNT in (#join(loans)#)
    
    
存量对公客户
===
select 
p1.CUS_NAME
 from
(select a.*,row_number() over(partition by CUS_NAME order by CUS_NAME) rn from 
(select p.* from RPT_M_RPT_SLS_ACCT p
where 
p.ACCOUNT_STATUS in ('1','6') 
and p.GL_CLASS not like '0%'
and CUST_TYPE like '2%') a) p1 
left join t_dict d on d.name = 'CERT_TYPE' and d.v_key = p1.CERT_TYPE
where rn = 1
@if(has(names)){
    and p1.cus_name in (#join(names)#)
@}
