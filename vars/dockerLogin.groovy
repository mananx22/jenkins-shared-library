import org.common.example.Docker

def call() {
   return new Docker(this).dockerLogin()
}