package yf.krodec.encoding

sealed class JValue {


    value class JObject(val map: Map<String, JValue>) : JValue
    value class JBool(val boolean: Boolean) : JValue
    value class JString(val string: String) : JValue
    value class JArray(val objs: List<JValue>) : JValue
    value class JNumber private constructor(val num: String) : JValue {
        companion object {
            fun from
        }
    }
    data class JNull() : JValue
}
