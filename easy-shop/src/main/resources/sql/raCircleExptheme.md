sample
===
* 注释

	select #use("cols")# from ra_circle_exptheme  where  #use("condition")#

cols
===
	theme_id,et_exp,et_time

updateSample
===
	
	theme_id=#themeId#,et_exp=#etExp#,et_time=#etTime#

condition
===

	1 = 1  
	@if(!isEmpty(themeId)){
	 and theme_id=#themeId#
	@}
	@if(!isEmpty(etExp)){
	 and et_exp=#etExp#
	@}
	@if(!isEmpty(etTime)){
	 and et_time=#etTime#
	@}
	
	