sample
===
* 注释

	select #use("cols")# from ra_circle_ml  where  #use("condition")#

cols
===
	circle_id,mlref_id,ml_1,ml_2,ml_3,ml_4,ml_5,ml_6,ml_7,ml_8,ml_9,ml_10,ml_11,ml_12,ml_13,ml_14,ml_15,ml_16

updateSample
===
	
	circle_id=#circleId#,mlref_id=#mlrefId#,ml_1=#ml1#,ml_2=#ml2#,ml_3=#ml3#,ml_4=#ml4#,ml_5=#ml5#,ml_6=#ml6#,ml_7=#ml7#,ml_8=#ml8#,ml_9=#ml9#,ml_10=#ml10#,ml_11=#ml11#,ml_12=#ml12#,ml_13=#ml13#,ml_14=#ml14#,ml_15=#ml15#,ml_16=#ml16#

condition
===

	1 = 1  
	@if(!isEmpty(circleId)){
	 and circle_id=#circleId#
	@}
	@if(!isEmpty(mlrefId)){
	 and mlref_id=#mlrefId#
	@}
	@if(!isEmpty(ml1)){
	 and ml_1=#ml1#
	@}
	@if(!isEmpty(ml2)){
	 and ml_2=#ml2#
	@}
	@if(!isEmpty(ml3)){
	 and ml_3=#ml3#
	@}
	@if(!isEmpty(ml4)){
	 and ml_4=#ml4#
	@}
	@if(!isEmpty(ml5)){
	 and ml_5=#ml5#
	@}
	@if(!isEmpty(ml6)){
	 and ml_6=#ml6#
	@}
	@if(!isEmpty(ml7)){
	 and ml_7=#ml7#
	@}
	@if(!isEmpty(ml8)){
	 and ml_8=#ml8#
	@}
	@if(!isEmpty(ml9)){
	 and ml_9=#ml9#
	@}
	@if(!isEmpty(ml10)){
	 and ml_10=#ml10#
	@}
	@if(!isEmpty(ml11)){
	 and ml_11=#ml11#
	@}
	@if(!isEmpty(ml12)){
	 and ml_12=#ml12#
	@}
	@if(!isEmpty(ml13)){
	 and ml_13=#ml13#
	@}
	@if(!isEmpty(ml14)){
	 and ml_14=#ml14#
	@}
	@if(!isEmpty(ml15)){
	 and ml_15=#ml15#
	@}
	@if(!isEmpty(ml16)){
	 and ml_16=#ml16#
	@}
	
	