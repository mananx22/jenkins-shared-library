// now we are importing our build image class from src folder
import org.common.example.Docker

def call(String img) {
//create a new instance of pur class, pass all parameters to it from current context
// and call a function from that class
   return new Docker(this).buildDockerImage(img)
}