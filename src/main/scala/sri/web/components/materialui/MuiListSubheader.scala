
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
 @JSImport("material-ui/List","ListSubheader")
object MuiListSubheaderComponent extends JSComponent[js.Object] {

 }

 object MuiListSubheader {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
disableSticky : OptionalParam[Boolean] = OptDefault,
inset : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
component : OptionalParam[String | js.Function] = OptDefault,
color : OptionalParam[MuiListSubheaderColor] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiListSubheaderComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiListSubheaderComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiListSubheaderComponent.type](
      MuiListSubheaderComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiListSubheaderC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiListSubheaderComponent.type](
      MuiListSubheaderComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         
 @js.native
 trait MuiListSubheaderColor extends js.Object

 object MuiListSubheaderColor {
   @inline def DEFAULT = "default".asInstanceOf[MuiListSubheaderColor] 
@inline def PRIMARY = "primary".asInstanceOf[MuiListSubheaderColor] 
@inline def INHERIT = "inherit".asInstanceOf[MuiListSubheaderColor] 
 }

       


     

         