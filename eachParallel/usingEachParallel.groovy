import static groovyx.gpars.GParsPool.withPool

def lista = [5000,100,200,300,400,100,900,300,6000]

def init = System.currentTimeMillis()
println "Inicia Conteo.."
withPool(9){ pool ->
  println pool
  lista.eachParallel{
    println it
    Thread.sleep it
  }
}
def ending = System.currentTimeMillis()

println "Total time: ${ending-init}"

