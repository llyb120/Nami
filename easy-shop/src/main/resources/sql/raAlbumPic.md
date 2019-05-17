sample
===
* 注释

	select #use("cols")# from ra_album_pic  where  #use("condition")#

cols
===
	apic_id,apic_name,apic_tag,aclass_id,apic_cover,apic_size,apic_spec,store_id,upload_time

updateSample
===
	
	apic_id=#apicId#,apic_name=#apicName#,apic_tag=#apicTag#,aclass_id=#aclassId#,apic_cover=#apicCover#,apic_size=#apicSize#,apic_spec=#apicSpec#,store_id=#storeId#,upload_time=#uploadTime#

condition
===

	1 = 1  
	@if(!isEmpty(apicId)){
	 and apic_id=#apicId#
	@}
	@if(!isEmpty(apicName)){
	 and apic_name=#apicName#
	@}
	@if(!isEmpty(apicTag)){
	 and apic_tag=#apicTag#
	@}
	@if(!isEmpty(aclassId)){
	 and aclass_id=#aclassId#
	@}
	@if(!isEmpty(apicCover)){
	 and apic_cover=#apicCover#
	@}
	@if(!isEmpty(apicSize)){
	 and apic_size=#apicSize#
	@}
	@if(!isEmpty(apicSpec)){
	 and apic_spec=#apicSpec#
	@}
	@if(!isEmpty(storeId)){
	 and store_id=#storeId#
	@}
	@if(!isEmpty(uploadTime)){
	 and upload_time=#uploadTime#
	@}
	
	