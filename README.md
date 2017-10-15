# ResponsiveJava
We can declare computations which can run themselves in response to some changes in a reactive source. The computations are just Runnable implementations.
The same Runnables used to define tasks in Threads. Only this time each computation will be re-executed everytime a reactive source the computation depends on changes.
The dependency has to be explicitly defined. 

AnyComputaion.dependsOn(someReactiveSource).

someReactiveSource extends ReactiveSource

Developers can identify the point of changes in ReactiveSource and accordingly make a call to rerunComputations().
