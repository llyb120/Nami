sample
===
* 注释

	select #use("cols")# from ra_rec_position  where  #use("condition")#

cols
===
	rec_id,pic_type,title,content

updateSample
===
	
	rec_id=#recId#,pic_type=#picType#,title=#title#,content=#content#

condition
===

	1 = 1  
	@if(!isEmpty(recId)){
	 and rec_id=#recId#
	@}
	@if(!isEmpty(picType)){
	 and pic_type=#picType#
	@}
	@if(!isEmpty(title)){
	 and title=#title#
	@}
	@if(!isEmpty(content)){
	 and content=#content#
	@}
	
	