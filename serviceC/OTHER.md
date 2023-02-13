./gradlew --info :serviceB:build
```
Initialized native services in: /Users/elenapliakas/.gradle/native
Initialized jansi services in: /Users/elenapliakas/.gradle/native
Received JVM installation metadata from '/Users/elenapliakas/.sdkman/candidates/java/17.0.2-tem': {JAVA_HOME=/Users/elenapliakas/.sdkman/candidates/java/17.0.2-tem, JAVA_VERSION=17.0.2, JAVA_VENDOR=Eclipse Adoptium, RUNTIME_NAME=OpenJDK Runtime Environment, RUNTIME_VERSION=17.0.2+8, VM_NAME=OpenJDK 64-Bit Server VM, VM_VERSION=17.0.2+8, VM_VENDOR=Eclipse Adoptium, OS_ARCH=aarch64}
The client will now receive all logging from the daemon (pid: 23203). The daemon log file: /Users/elenapliakas/.gradle/daemon/7.6/daemon-23203.out.log
Starting 74th build in daemon [uptime: 3 hrs 14 mins 16.089 secs, performance: 100%, non-heap usage: 36% of 256 MiB]
Using 10 worker leases.
Now considering [/Users/elenapliakas/gradle-practice/yaMonoRepo, /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceC, /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB, /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceA, /Users/elenapliakas/gradle-practice/yaMonoRepo/libX] as hierarchies to watch
Watching the file system is configured to be enabled if available
File system watching is active
Starting Build
Settings evaluated using settings file '/Users/elenapliakas/gradle-practice/yaMonoRepo/settings.gradle'.
Now considering [/Users/elenapliakas/gradle-practice/yaMonoRepo/libX, /Users/elenapliakas/gradle-practice/yaMonoRepo, /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceC, /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB, /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceA] as hierarchies to watch
Now considering [/Users/elenapliakas/gradle-practice/yaMonoRepo/serviceA, /Users/elenapliakas/gradle-practice/yaMonoRepo/libX, /Users/elenapliakas/gradle-practice/yaMonoRepo, /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceC, /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB] as hierarchies to watch
Now considering [/Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB, /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceA, /Users/elenapliakas/gradle-practice/yaMonoRepo/libX, /Users/elenapliakas/gradle-practice/yaMonoRepo, /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceC] as hierarchies to watch
Now considering [/Users/elenapliakas/gradle-practice/yaMonoRepo/serviceC, /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB, /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceA, /Users/elenapliakas/gradle-practice/yaMonoRepo/libX, /Users/elenapliakas/gradle-practice/yaMonoRepo] as hierarchies to watch
Skipping generation of dependency accessors for libs as it is up-to-date.
Projects loaded. Root project using build file '/Users/elenapliakas/gradle-practice/yaMonoRepo/build.gradle'.
Included projects: [root project 'yaMonoRepo']
Skipping generation of dependency accessors for libs as it is up-to-date.

> Configure project :libX
Evaluating project ':libX' using build file '/Users/elenapliakas/gradle-practice/yaMonoRepo/libX/build.gradle'.
Registering project ':libX' in composite build. Will substitute for module 'com.elenappli:libX'.
Skipping generation of dependency accessors for libs as it is up-to-date.

> Configure project :serviceA
Evaluating project ':serviceA' using build file '/Users/elenapliakas/gradle-practice/yaMonoRepo/serviceA/build.gradle'.
Applying dependency management to configuration 'annotationProcessor' in project 'serviceA'
Applying dependency management to configuration 'apiElements' in project 'serviceA'
Applying dependency management to configuration 'archives' in project 'serviceA'
Applying dependency management to configuration 'bootArchives' in project 'serviceA'
Applying dependency management to configuration 'compileClasspath' in project 'serviceA'
Applying dependency management to configuration 'compileOnly' in project 'serviceA'
Applying dependency management to configuration 'default' in project 'serviceA'
Applying dependency management to configuration 'developmentOnly' in project 'serviceA'
Applying dependency management to configuration 'implementation' in project 'serviceA'
Applying dependency management to configuration 'mainSourceElements' in project 'serviceA'
Applying dependency management to configuration 'productionRuntimeClasspath' in project 'serviceA'
Applying dependency management to configuration 'runtimeClasspath' in project 'serviceA'
Applying dependency management to configuration 'runtimeElements' in project 'serviceA'
Applying dependency management to configuration 'runtimeOnly' in project 'serviceA'
Applying dependency management to configuration 'testAnnotationProcessor' in project 'serviceA'
Applying dependency management to configuration 'testCompileClasspath' in project 'serviceA'
Applying dependency management to configuration 'testCompileOnly' in project 'serviceA'
Applying dependency management to configuration 'testImplementation' in project 'serviceA'
Applying dependency management to configuration 'testResultsElementsForTest' in project 'serviceA'
Applying dependency management to configuration 'testRuntimeClasspath' in project 'serviceA'
Applying dependency management to configuration 'testRuntimeOnly' in project 'serviceA'
Registering project ':serviceA' in composite build. Will substitute for module 'com.elenappli:serviceA'.
Skipping generation of dependency accessors for libs as it is up-to-date.

> Configure project :serviceB
Evaluating project ':serviceB' using build file '/Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build.gradle'.
Applying dependency management to configuration 'annotationProcessor' in project 'serviceB'
Applying dependency management to configuration 'apiElements' in project 'serviceB'
Applying dependency management to configuration 'archives' in project 'serviceB'
Applying dependency management to configuration 'bootArchives' in project 'serviceB'
Applying dependency management to configuration 'compileClasspath' in project 'serviceB'
Applying dependency management to configuration 'compileOnly' in project 'serviceB'
Applying dependency management to configuration 'default' in project 'serviceB'
Applying dependency management to configuration 'developmentOnly' in project 'serviceB'
Applying dependency management to configuration 'implementation' in project 'serviceB'
Applying dependency management to configuration 'mainSourceElements' in project 'serviceB'
Applying dependency management to configuration 'productionRuntimeClasspath' in project 'serviceB'
Applying dependency management to configuration 'runtimeClasspath' in project 'serviceB'
Applying dependency management to configuration 'runtimeElements' in project 'serviceB'
Applying dependency management to configuration 'runtimeOnly' in project 'serviceB'
Applying dependency management to configuration 'testAnnotationProcessor' in project 'serviceB'
Applying dependency management to configuration 'testCompileClasspath' in project 'serviceB'
Applying dependency management to configuration 'testCompileOnly' in project 'serviceB'
Applying dependency management to configuration 'testImplementation' in project 'serviceB'
Applying dependency management to configuration 'testResultsElementsForTest' in project 'serviceB'
Applying dependency management to configuration 'testRuntimeClasspath' in project 'serviceB'
Applying dependency management to configuration 'testRuntimeOnly' in project 'serviceB'
Registering project ':serviceB' in composite build. Will substitute for module 'com.elenappli:serviceB'.
Skipping generation of dependency accessors for libs as it is up-to-date.

> Configure project :serviceC
Evaluating project ':serviceC' using build file '/Users/elenapliakas/gradle-practice/yaMonoRepo/serviceC/build.gradle'.
Applying dependency management to configuration 'annotationProcessor' in project 'serviceC'
Applying dependency management to configuration 'apiElements' in project 'serviceC'
Applying dependency management to configuration 'archives' in project 'serviceC'
Applying dependency management to configuration 'bootArchives' in project 'serviceC'
Applying dependency management to configuration 'compileClasspath' in project 'serviceC'
Applying dependency management to configuration 'compileOnly' in project 'serviceC'
Applying dependency management to configuration 'default' in project 'serviceC'
Applying dependency management to configuration 'developmentOnly' in project 'serviceC'
Applying dependency management to configuration 'implementation' in project 'serviceC'
Applying dependency management to configuration 'mainSourceElements' in project 'serviceC'
Applying dependency management to configuration 'productionRuntimeClasspath' in project 'serviceC'
Applying dependency management to configuration 'runtimeClasspath' in project 'serviceC'
Applying dependency management to configuration 'runtimeElements' in project 'serviceC'
Applying dependency management to configuration 'runtimeOnly' in project 'serviceC'
Applying dependency management to configuration 'testAnnotationProcessor' in project 'serviceC'
Applying dependency management to configuration 'testCompileClasspath' in project 'serviceC'
Applying dependency management to configuration 'testCompileOnly' in project 'serviceC'
Applying dependency management to configuration 'testImplementation' in project 'serviceC'
Applying dependency management to configuration 'testResultsElementsForTest' in project 'serviceC'
Applying dependency management to configuration 'testRuntimeClasspath' in project 'serviceC'
Applying dependency management to configuration 'testRuntimeOnly' in project 'serviceC'
Registering project ':serviceC' in composite build. Will substitute for module 'com.elenappli:serviceC'.

> Configure project :
Evaluating root project 'yaMonoRepo' using build file '/Users/elenapliakas/gradle-practice/yaMonoRepo/build.gradle'.
All projects evaluated.
Task path ':serviceB:build' matched project ':serviceB'
Task name matched 'build'
Selected primary task 'build' from project :
Resolving global dependency management for project 'serviceB'
Found project 'project :libX' as substitute for module 'com.elenappli:libX'.
Excluding []
Found project 'project :libX' as substitute for module 'com.elenappli:libX'.
Excluding []
Found project 'project :libX' as substitute for module 'com.elenappli:libX'.
Excluding []
Found project 'project :libX' as substitute for module 'com.elenappli:libX'.
Found project 'project :libX' as substitute for module 'com.elenappli:libX'.
Excluding []
Found project 'project :libX' as substitute for module 'com.elenappli:libX'.
Excluding []
Found project 'project :libX' as substitute for module 'com.elenappli:libX'.
Excluding []
Found project 'project :libX' as substitute for module 'com.elenappli:libX'.
Tasks to be executed: []
Tasks that were excluded: []
Resolve mutations for :serviceB:processResources (Thread[included builds Thread 2,5,main]) started.
Resolve mutations for :libX:compileJava (Thread[Execution worker,5,main]) started.
destroyer locations for task group 0 (Thread[Execution worker Thread 2,5,main]) started.
:serviceB:processResources (Thread[included builds Thread 2,5,main]) started.
producer locations for task group 0 (Thread[Execution worker,5,main]) started.
:libX:compileJava (Thread[Execution worker Thread 3,5,main]) started.

> Task :libX:compileJava UP-TO-DATE
Caching disabled for task ':libX:compileJava' because:
Build cache is disabled
Skipping task ':libX:compileJava' as it is up-to-date.
other build task :libX:compileJava (Thread[Execution worker Thread 3,5,main]) started.
Resolve mutations for :libX:processResources (Thread[included builds,5,main]) started.
work action resolve main (project :libX) (Thread[Execution worker Thread 3,5,main]) started.
:libX:processResources (Thread[included builds,5,main]) started.

> Task :libX:processResources NO-SOURCE
Skipping task ':libX:processResources' as it has no source files and no previous output files.
Resolve mutations for :libX:classes (Thread[included builds,5,main]) started.
:libX:classes (Thread[included builds,5,main]) started.

> Task :libX:classes UP-TO-DATE
Skipping task ':libX:classes' as it has no actions.
Resolve mutations for :libX:jar (Thread[included builds,5,main]) started.
producer locations for task group 1 (Thread[included builds,5,main]) started.
:libX:jar (Thread[included builds,5,main]) started.

> Task :serviceB:processResources
Caching disabled for task ':serviceB:processResources' because:
Build cache is disabled
Task ':serviceB:processResources' is not up-to-date because:
Output property 'destinationDir' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/resources/main has been removed.
Output property 'destinationDir' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/resources/main/application.properties has been removed.
Resolve mutations for :serviceB:compileJava (Thread[included builds Thread 2,5,main]) started.
:serviceB:compileJava (Thread[included builds Thread 2,5,main]) started.

> Task :libX:jar UP-TO-DATE
Caching disabled for task ':libX:jar' because:
Build cache is disabled
Skipping task ':libX:jar' as it is up-to-date.
other build task :libX:jar (Thread[Execution worker Thread 5,5,main]) started.
work action resolve libX.jar (project :libX) (Thread[Execution worker Thread 5,5,main]) started.

> Task :serviceB:compileJava
Caching disabled for task ':serviceB:compileJava' because:
Build cache is disabled
Task ':serviceB:compileJava' is not up-to-date because:
Output property 'destinationDirectory' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/classes/java/main has been removed.
Output property 'destinationDirectory' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/classes/java/main/com has been removed.
Output property 'destinationDirectory' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/classes/java/main/com/elenappli has been removed.
The input changes require a full rebuild for incremental task ':serviceB:compileJava'.
Full recompilation is required because no incremental change information is available. This is usually caused by clean builds or changing compiler arguments.
Compiling with toolchain '/Users/elenapliakas/.sdkman/candidates/java/17.0.2-tem'.
Compiling with JDK Java compiler API.
Class dependency analysis for incremental compilation took 0.0 secs.
Created classpath snapshot for incremental compilation in 0.005 secs.
Resolve mutations for :serviceB:classes (Thread[included builds Thread 2,5,main]) started.
:serviceB:classes (Thread[included builds Thread 2,5,main]) started.

> Task :serviceB:classes
Skipping task ':serviceB:classes' as it has no actions.
Resolve mutations for :serviceB:bootJarMainClassName (Thread[included builds Thread 2,5,main]) started.
:serviceB:bootJarMainClassName (Thread[included builds Thread 2,5,main]) started.

> Task :serviceB:bootJarMainClassName
Excluding []
Found project 'project :libX' as substitute for module 'com.elenappli:libX'.
Excluding []
Found project 'project :libX' as substitute for module 'com.elenappli:libX'.
Caching disabled for task ':serviceB:bootJarMainClassName' because:
Build cache is disabled
Task ':serviceB:bootJarMainClassName' is not up-to-date because:
Output property 'outputFile' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/bootJarMainClassName has been removed.
Resolve mutations for :serviceB:bootJar (Thread[included builds Thread 2,5,main]) started.
:serviceB:bootJar (Thread[included builds Thread 2,5,main]) started.

> Task :serviceB:bootJar
Caching disabled for task ':serviceB:bootJar' because:
Build cache is disabled
Task ':serviceB:bootJar' is not up-to-date because:
Output property 'archiveFile' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/libs/serviceB.jar has been removed.
Resolve mutations for :serviceB:jar (Thread[included builds Thread 2,5,main]) started.
:serviceB:jar (Thread[included builds Thread 2,5,main]) started.

> Task :serviceB:jar
Caching disabled for task ':serviceB:jar' because:
Build cache is disabled
Task ':serviceB:jar' is not up-to-date because:
Output property 'archiveFile' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/libs/serviceB-plain.jar has been removed.
Resolve mutations for :serviceB:assemble (Thread[included builds Thread 2,5,main]) started.
:serviceB:assemble (Thread[included builds Thread 2,5,main]) started.

> Task :serviceB:assemble
Skipping task ':serviceB:assemble' as it has no actions.
Resolve mutations for :serviceB:compileTestJava (Thread[included builds Thread 2,5,main]) started.
:serviceB:compileTestJava (Thread[included builds Thread 2,5,main]) started.

> Task :serviceB:compileTestJava
Caching disabled for task ':serviceB:compileTestJava' because:
Build cache is disabled
Task ':serviceB:compileTestJava' is not up-to-date because:
Output property 'destinationDirectory' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/classes/java/test has been removed.
Output property 'destinationDirectory' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/classes/java/test/com has been removed.
Output property 'destinationDirectory' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/classes/java/test/com/elenappli has been removed.
The input changes require a full rebuild for incremental task ':serviceB:compileTestJava'.
Full recompilation is required because no incremental change information is available. This is usually caused by clean builds or changing compiler arguments.
Compiling with toolchain '/Users/elenapliakas/.sdkman/candidates/java/17.0.2-tem'.
Compiling with JDK Java compiler API.
Class dependency analysis for incremental compilation took 0.0 secs.
Created classpath snapshot for incremental compilation in 0.004 secs.
Resolve mutations for :serviceB:processTestResources (Thread[included builds Thread 2,5,main]) started.
:serviceB:processTestResources (Thread[included builds Thread 2,5,main]) started.

> Task :serviceB:processTestResources NO-SOURCE
Skipping task ':serviceB:processTestResources' as it has no source files and no previous output files.
Resolve mutations for :serviceB:testClasses (Thread[included builds Thread 2,5,main]) started.
:serviceB:testClasses (Thread[included builds Thread 2,5,main]) started.

> Task :serviceB:testClasses
Skipping task ':serviceB:testClasses' as it has no actions.
Resolve mutations for :serviceB:test (Thread[included builds Thread 2,5,main]) started.
producer locations for task group 0 (Thread[included builds Thread 2,5,main]) started.
:serviceB:test (Thread[Execution worker,5,main]) started.
Gradle Test Executor 9 started executing tests.
Gradle Test Executor 9 finished executing tests.

> Task :serviceB:test
Caching disabled for task ':serviceB:test' because:
Build cache is disabled
Task ':serviceB:test' is not up-to-date because:
Output property 'binaryResultsDirectory' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/test-results/test/binary has been removed.
Output property 'binaryResultsDirectory' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/test-results/test/binary/output.bin has been removed.
Output property 'binaryResultsDirectory' file /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/test-results/test/binary/output.bin.idx has been removed.
Starting process 'Gradle Test Executor 9'. Working directory: /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB Command: /Users/elenapliakas/.sdkman/candidates/java/17.0.2-tem/bin/java -Dorg.gradle.internal.worker.tmpdir=/Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/tmp/test/work -Dorg.gradle.native=false @/Users/elenapliakas/.gradle/.tmp/gradle-worker-classpath6916008748533291187txt -Xmx512m -Dfile.encoding=UTF-8 -Duser.country=NL -Duser.language=en -Duser.variant -ea worker.org.gradle.process.internal.worker.GradleWorkerMain 'Gradle Test Executor 9'
Successfully started process 'Gradle Test Executor 9'

ServiceBApplicationTests STANDARD_OUT
16:17:31.740 [Test worker] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
16:17:31.744 [Test worker] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
16:17:31.757 [Test worker] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.elenappli.serviceB.ServiceBApplicationTests] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
16:17:31.761 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.elenappli.serviceB.ServiceBApplicationTests], using SpringBootContextLoader
16:17:31.762 [Test worker] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.elenappli.serviceB.ServiceBApplicationTests]: class path resource [com/elenappli/serviceB/ServiceBApplicationTests-context.xml] does not exist
16:17:31.762 [Test worker] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.elenappli.serviceB.ServiceBApplicationTests]: class path resource [com/elenappli/serviceB/ServiceBApplicationTestsContext.groovy] does not exist
16:17:31.762 [Test worker] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.elenappli.serviceB.ServiceBApplicationTests]: no resource found for suffixes {-context.xml, Context.groovy}.
16:17:31.762 [Test worker] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [com.elenappli.serviceB.ServiceBApplicationTests]: ServiceBApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
16:17:31.776 [Test worker] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.elenappli.serviceB.ServiceBApplicationTests]
16:17:31.797 [Test worker] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [/Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/classes/java/main/com/elenappli/serviceB/ServiceBApplication.class]
16:17:31.802 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration com.elenappli.serviceB.ServiceBApplication for test class com.elenappli.serviceB.ServiceBApplicationTests
16:17:31.835 [Test worker] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.elenappli.serviceB.ServiceBApplicationTests]: using defaults.
16:17:31.835 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.event.ApplicationEventsTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener, org.springframework.test.context.event.EventPublishingTestExecutionListener]
16:17:31.839 [Test worker] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.transaction.TransactionalTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttributeSource]
16:17:31.839 [Test worker] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttribute]
16:17:31.839 [Test worker] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@7cd1ac19, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@2f40a43, org.springframework.test.context.event.ApplicationEventsTestExecutionListener@3caa4757, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@69c43e48, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@1804f60d, org.springframework.test.context.support.DirtiesContextTestExecutionListener@3a80515c, org.springframework.test.context.event.EventPublishingTestExecutionListener@547e29a4, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@1c807b1d, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@238b521e, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@1b39fd82, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@3e2fc448, org.springframework.boot.test.autoconfigure.webservices.client.MockWebServiceServerTestExecutionListener@21680803, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@588ab592]
16:17:31.840 [Test worker] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@6d1310f6 testClass = ServiceBApplicationTests, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@3228d990 testClass = ServiceBApplicationTests, locations = '{}', classes = '{class com.elenappli.serviceB.ServiceBApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.autoconfigure.actuate.metrics.MetricsExportContextCustomizerFactory$DisableMetricExportContextCustomizer@7fc6de5b, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@57eda880, org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@7c209437, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@4febb875, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@758c83d8, org.springframework.boot.test.context.SpringBootTestArgs@1, org.springframework.boot.test.context.SpringBootTestWebEnvironment@6ca18a14], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true]], class annotated with @DirtiesContext [false] with mode [null].

      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::                (v2.7.8)

    2023-02-13 16:17:32.188  INFO 37580 --- [    Test worker] c.e.serviceB.ServiceBApplicationTests    : Starting ServiceBApplicationTests using Java 17.0.2 on Picnics-MacBook-Pro-35.local with PID 37580 (started by elenapliakas in /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB)
    2023-02-13 16:17:32.188  INFO 37580 --- [    Test worker] c.e.serviceB.ServiceBApplicationTests    : No active profile set, falling back to 1 default profile: "default"
    2023-02-13 16:17:33.125  INFO 37580 --- [    Test worker] c.e.serviceB.ServiceBApplicationTests    : Started ServiceBApplicationTests in 1.272 seconds (JVM running for 1.719)
Finished generating test XML results (0.0 secs) into: /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/test-results/test
Generating HTML test report...
Finished generating test html results (0.0 secs) into: /Users/elenapliakas/gradle-practice/yaMonoRepo/serviceB/build/reports/tests/test
Resolve mutations for :serviceB:check (Thread[Execution worker,5,main]) started.
:serviceB:check (Thread[Execution worker,5,main]) started.

> Task :serviceB:check
Skipping task ':serviceB:check' as it has no actions.
Resolve mutations for :serviceB:build (Thread[Execution worker,5,main]) started.
:serviceB:build (Thread[Execution worker,5,main]) started.

> Task :serviceB:build
Skipping task ':serviceB:build' as it has no actions.
other build task :serviceB:build (Thread[Execution worker,5,main]) started.

BUILD SUCCESSFUL in 2s
9 actionable tasks: 7 executed, 2 up-to-date
Watched directory hierarchies: [/Users/elenapliakas/gradle-practice/yaMonoRepo]
```