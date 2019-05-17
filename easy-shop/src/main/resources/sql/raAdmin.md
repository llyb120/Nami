sample
===
* 注释

	select #use("cols")# from ra_admin  where  #use("condition")#

cols
===
	admin_id,admin_name,admin_password,admin_login_time,admin_login_num,admin_is_super,admin_gid

updateSample
===
	
	admin_id=#adminId#,admin_name=#adminName#,admin_password=#adminPassword#,admin_login_time=#adminLoginTime#,admin_login_num=#adminLoginNum#,admin_is_super=#adminIsSuper#,admin_gid=#adminGid#

condition
===

	1 = 1  
	@if(!isEmpty(adminId)){
	 and admin_id=#adminId#
	@}
	@if(!isEmpty(adminName)){
	 and admin_name=#adminName#
	@}
	@if(!isEmpty(adminPassword)){
	 and admin_password=#adminPassword#
	@}
	@if(!isEmpty(adminLoginTime)){
	 and admin_login_time=#adminLoginTime#
	@}
	@if(!isEmpty(adminLoginNum)){
	 and admin_login_num=#adminLoginNum#
	@}
	@if(!isEmpty(adminIsSuper)){
	 and admin_is_super=#adminIsSuper#
	@}
	@if(!isEmpty(adminGid)){
	 and admin_gid=#adminGid#
	@}
	
	