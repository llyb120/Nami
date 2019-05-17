sample
===
* 注释

	select #use("cols")# from ra_mail_cron  where  #use("condition")#

cols
===
	mail_id,mail,subject,contnet

updateSample
===
	
	mail_id=#mailId#,mail=#mail#,subject=#subject#,contnet=#contnet#

condition
===

	1 = 1  
	@if(!isEmpty(mailId)){
	 and mail_id=#mailId#
	@}
	@if(!isEmpty(mail)){
	 and mail=#mail#
	@}
	@if(!isEmpty(subject)){
	 and subject=#subject#
	@}
	@if(!isEmpty(contnet)){
	 and contnet=#contnet#
	@}
	
	