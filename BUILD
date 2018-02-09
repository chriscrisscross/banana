java_binary(
    name = "ProjectRunner",
    srcs = glob(["src/main/java/com/example/*.java"]),
)

java_library (
	name="Greeting",
	srcs=glob(["src/main/java/com/example/*.java"]),
)

java_test (
	name="GreetingTest",
	size="small",
	srcs=["src/test/java/com/example/GreetingTest.java"],
	deps = [
		":Greeting",
	]
)

