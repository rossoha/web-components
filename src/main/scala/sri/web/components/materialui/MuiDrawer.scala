
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
 @JSImport("material-ui/Drawer",JSImport.Default)
object MuiDrawerComponent extends JSComponent[js.Object] {

 }

 object MuiDrawer {

    @inline
    def apply(anchor : OptionalParam[MuiDrawerAnchor] = OptDefault,
id : OptionalParam[String] = OptDefault,
transitionDuration : OptionalParam[Double | Int | js.Object] = OptDefault,
className : OptionalParam[String] = OptDefault,
open : OptionalParam[Boolean] = OptDefault,
ModalProps : OptionalParam[js.Object] = OptDefault,
elevation : OptionalParam[Double | Int] = OptDefault,
`type` : OptionalParam[MuiDrawerType] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
onClose : OptionalParam[(ReactEventH) => _] = OptDefault,
SlideProps : OptionalParam[js.Object] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiDrawerComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiDrawerComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiDrawerComponent.type](
      MuiDrawerComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiDrawerC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiDrawerComponent.type](
      MuiDrawerComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         
 @js.native
 trait MuiDrawerAnchor extends js.Object

 object MuiDrawerAnchor {
   @inline def LEFT = "left".asInstanceOf[MuiDrawerAnchor] 
@inline def TOP = "top".asInstanceOf[MuiDrawerAnchor] 
@inline def RIGHT = "right".asInstanceOf[MuiDrawerAnchor] 
@inline def BOTTOM = "bottom".asInstanceOf[MuiDrawerAnchor] 
 }

       

 @js.native
 trait MuiDrawerType extends js.Object

 object MuiDrawerType {
   @inline def PERMANENT = "permanent".asInstanceOf[MuiDrawerType] 
@inline def PERSISTENT = "persistent".asInstanceOf[MuiDrawerType] 
@inline def TEMPORARY = "temporary".asInstanceOf[MuiDrawerType] 
 }

       


     

         