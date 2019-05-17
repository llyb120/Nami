sample
===
* 注释

	select #use("cols")# from ra_circle_mlref  where  #use("condition")#

cols
===
	mlref_id,mlref_name,mlref_addtime,mlref_status,mlref_1,mlref_2,mlref_3,mlref_4,mlref_5,mlref_6,mlref_7,mlref_8,mlref_9,mlref_10,mlref_11,mlref_12,mlref_13,mlref_14,mlref_15,mlref_16

updateSample
===
	
	mlref_id=#mlrefId#,mlref_name=#mlrefName#,mlref_addtime=#mlrefAddtime#,mlref_status=#mlrefStatus#,mlref_1=#mlref1#,mlref_2=#mlref2#,mlref_3=#mlref3#,mlref_4=#mlref4#,mlref_5=#mlref5#,mlref_6=#mlref6#,mlref_7=#mlref7#,mlref_8=#mlref8#,mlref_9=#mlref9#,mlref_10=#mlref10#,mlref_11=#mlref11#,mlref_12=#mlref12#,mlref_13=#mlref13#,mlref_14=#mlref14#,mlref_15=#mlref15#,mlref_16=#mlref16#

condition
===

	1 = 1  
	@if(!isEmpty(mlrefId)){
	 and mlref_id=#mlrefId#
	@}
	@if(!isEmpty(mlrefName)){
	 and mlref_name=#mlrefName#
	@}
	@if(!isEmpty(mlrefAddtime)){
	 and mlref_addtime=#mlrefAddtime#
	@}
	@if(!isEmpty(mlrefStatus)){
	 and mlref_status=#mlrefStatus#
	@}
	@if(!isEmpty(mlref1)){
	 and mlref_1=#mlref1#
	@}
	@if(!isEmpty(mlref2)){
	 and mlref_2=#mlref2#
	@}
	@if(!isEmpty(mlref3)){
	 and mlref_3=#mlref3#
	@}
	@if(!isEmpty(mlref4)){
	 and mlref_4=#mlref4#
	@}
	@if(!isEmpty(mlref5)){
	 and mlref_5=#mlref5#
	@}
	@if(!isEmpty(mlref6)){
	 and mlref_6=#mlref6#
	@}
	@if(!isEmpty(mlref7)){
	 and mlref_7=#mlref7#
	@}
	@if(!isEmpty(mlref8)){
	 and mlref_8=#mlref8#
	@}
	@if(!isEmpty(mlref9)){
	 and mlref_9=#mlref9#
	@}
	@if(!isEmpty(mlref10)){
	 and mlref_10=#mlref10#
	@}
	@if(!isEmpty(mlref11)){
	 and mlref_11=#mlref11#
	@}
	@if(!isEmpty(mlref12)){
	 and mlref_12=#mlref12#
	@}
	@if(!isEmpty(mlref13)){
	 and mlref_13=#mlref13#
	@}
	@if(!isEmpty(mlref14)){
	 and mlref_14=#mlref14#
	@}
	@if(!isEmpty(mlref15)){
	 and mlref_15=#mlref15#
	@}
	@if(!isEmpty(mlref16)){
	 and mlref_16=#mlref16#
	@}
	
	