
package sri.web.components.materialui;


import sri.core._
import scalajsplus.macros.{
  FunctionObjectMacro,
  exclude,
  rename
}
import scalajsplus._
import sri.universal._
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.annotation.JSName
import sri.web.vdom.DOMProps
import org.scalajs.dom
import sri.web.vdom.ReactEventAliases._
import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|
     




 @js.native
 @JSImport("@material-ui/core/InputLabel",JSImport.Default)
object MuiInputLabelComponent extends JSComponent[js.Object] {

 }

 object MuiInputLabel {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
className : OptionalParam[String] = OptDefault,
margin : OptionalParam[MuiInputLabelMargin] = OptDefault,
required : OptionalParam[Boolean] = OptDefault,
disableAnimation : OptionalParam[Boolean] = OptDefault,
disabled : OptionalParam[Boolean] = OptDefault,
shrink : OptionalParam[Boolean] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
FormLabelClasses : OptionalParam[js.Object] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
error : OptionalParam[Boolean] = OptDefault,
focused : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiInputLabelComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiInputLabelComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiInputLabelComponent.type](
      MuiInputLabelComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiInputLabelC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiInputLabelComponent.type](
      MuiInputLabelComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         
 @js.native
 trait MuiInputLabelMargin extends js.Object

 object MuiInputLabelMargin {
   @inline def DENSE = "dense".asInstanceOf[MuiInputLabelMargin] 
 }

       


     

         