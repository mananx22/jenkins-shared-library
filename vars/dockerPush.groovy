import org.common.example.Docker

def call(String img) {
   return new Docker(this).dockerLogin(img)
}