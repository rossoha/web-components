
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
 @JSImport("material-ui/Hidden",JSImport.Default)
object MuiHiddenComponent extends JSComponent[js.Object] {

 }

 object MuiHidden {

    @inline
    def apply(id : OptionalParam[String] = OptDefault,
lgDown : OptionalParam[Boolean] = OptDefault,
className : OptionalParam[String] = OptDefault,
mdDown : OptionalParam[Boolean] = OptDefault,
mdUp : OptionalParam[Boolean] = OptDefault,
only : OptionalParam[MuiBreakpoint | js.Array[MuiBreakpoint]] = OptDefault,
onChange : OptionalParam[(ReactEventH,Boolean) => _] = OptDefault,
smUp : OptionalParam[Boolean] = OptDefault,
initialWidth : OptionalParam[MuiHiddenInitialWidth] = OptDefault,
onClick : OptionalParam[ReactEventH => _] = OptDefault,
xsUp : OptionalParam[Boolean] = OptDefault,
implementation : OptionalParam[MuiHiddenImplementation] = OptDefault,
style : OptionalParam[js.Any] = OptDefault,
xlUp : OptionalParam[Boolean] = OptDefault,
xsDown : OptionalParam[Boolean] = OptDefault,
lgUp : OptionalParam[Boolean] = OptDefault,
smDown : OptionalParam[Boolean] = OptDefault,
xlDown : OptionalParam[Boolean] = OptDefault,
classes : OptionalParam[js.Object] = OptDefault,
          @exclude extraProps : OptionalParam[DOMProps] = OptDefault,
@exclude key: String | Int = null,
      @exclude ref: js.Function1[MuiHiddenComponent.type, Unit] = null)(children: ReactNode*): ReactElement { type Instance = MuiHiddenComponent.type}  = {
      import DangerousUnionToJSAnyImplicit._
      val props = FunctionObjectMacro()
      extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[MuiHiddenComponent.type](
      MuiHiddenComponent,
      props,
      key,
      ref,children.toJSArray)
    }
 }

 

 object MuiHiddenC {

   @inline
   def apply(children:ReactNode*) = {
     CreateElementJS[MuiHiddenComponent.type](
      MuiHiddenComponent,
      json(),
      children = children.toJSArray)
   }

 }

          

         
 @js.native
 trait MuiHiddenInitialWidth extends js.Object

 object MuiHiddenInitialWidth {
   @inline def XS = "xs".asInstanceOf[MuiHiddenInitialWidth] 
@inline def SM = "sm".asInstanceOf[MuiHiddenInitialWidth] 
@inline def MD = "md".asInstanceOf[MuiHiddenInitialWidth] 
@inline def LG = "lg".asInstanceOf[MuiHiddenInitialWidth] 
@inline def XL = "xl".asInstanceOf[MuiHiddenInitialWidth] 
 }

       

 @js.native
 trait MuiHiddenImplementation extends js.Object

 object MuiHiddenImplementation {
   @inline def JS = "js".asInstanceOf[MuiHiddenImplementation] 
@inline def CSS = "css".asInstanceOf[MuiHiddenImplementation] 
 }

       


     

         