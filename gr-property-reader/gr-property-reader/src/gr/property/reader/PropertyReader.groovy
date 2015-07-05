package gr.property.reader

final String prop_path = "/home/vitorenio/workspace/gr-property-reader/src/test.properties"
def prop = new Properties()

new File(prop_path).withInputStream() {
	stream -> prop.load(stream)
}

def slurper = new ConfigSlurper().parse(prop)
println slurper.rg.prop.each {
	println it
}
println "finish."
