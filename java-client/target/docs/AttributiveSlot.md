

# AttributiveSlot

A slot bound to an Attribute (data property)
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subjectBinding** | **Integer** | Slot&#39;s subject binding, must be a ConceptualSlot in the same frame. | 
**objectBinding** | **Integer** | Slot&#39;s object binding, must be a ValueSlot in the same frame. |  [optional]
**comparation** | [**ComparationEnum**](#ComparationEnum) | Comparation operator for data values (opt) |  [optional]



## Enum: ComparationEnum

Name | Value
---- | -----
EQUAL | &quot;EQUAL&quot;
GREATER | &quot;GREATER&quot;
SMALLER | &quot;SMALLER&quot;
SIMILAR | &quot;SIMILAR&quot;



