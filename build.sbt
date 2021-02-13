name := """play-wat-vmware"""

version := "2.8.x"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

initialize := {
  val _ = initialize.value // run the previous initialization
  val required = "1.8"
  val current  = sys.props("java.specification.version")
  assert(current == required, s"Unsupported JDK: java.specification.version $current != $required")
}

val oidc_oauth2_version = "0.0.1"
val vmc_draas_version = "1.23.0"
val vapi_version = "2.19.0"
val vsphereautomationsdk_version = "3.5.0"
val vmc_version = "1.35.0"
val nsxpolicysdk_version = "3.0.2.0.0.16837625"
val nsxvmcawsint_version = "3.0.2.0.0.16837625"
val nsxvmcsdkcommon_version = "3.0.2.0.0.16837625"
val vspherewssdk_version = "6.7.3"
val lookupservice_version = "1.0.0"
val jackson2_version = "2.10.0"
val httpclient_version = "4.5.10"
val httpasyncclient_version = "4.1.4"
val slf4j_version = "1.7.12"
val commons_lang3_version = "3.9"
val commons_configuration_version = "1.10"
val commons_cli_version = "1.4"
val commons_beanutils_version = "1.9.4"

libraryDependencies ++= Seq(
  guice,
  //  "com.vmware.vapi" % "oidc-oauth2-sdk" % oidc_oauth2_version,
  //  "com.vmware.vmc" % "vmc-draas-bindings" % vmc_draas_version,
  //  "com.vmware.vapi" % "vapi-runtime" % vapi_version,
  //  "com.vmware.vapi" % "vapi-authentication" % vapi_version,
  //  "com.vmware.vapi" % "vapi-samltoken" % vapi_version,
  //  "com.vmware" % "vsphereautomation-client-sdk" % vsphereautomationsdk_version,
  //  "com.vmware.vmc" % "vmc-bindings" % vmc_version,
  //  "com.vmware.vapi" % "vapi-vmc-sdk" % vapi_version,
  //  "com.vmware.nsx" % "nsx-vmc-policy-java-sdk" % nsxpolicysdk_version,
  //  "com.vmware.nsx" % "nsx-vmc-aws-integration-sdk" % nsxvmcawsint_version,
  //  "com.vmware.nsx" % "nsx-vmc-sdk-common" % nsxvmcsdkcommon_version,
  //  "com.vmware.vim25" % "vim25" % vspherewssdk_version,
  //  "com.vmware.sso" % "ssoclient" % vspherewssdk_version,
  //  "com.vmware.vsphereautomation.lookup" % "vsphereautomation-lookupservice" % lookupservice_version,
  "com.fasterxml.jackson.core" % "jackson-core" % jackson2_version ,
  "com.fasterxml.jackson.core" % "jackson-annotations" % jackson2_version ,
  "com.fasterxml.jackson.core" % "jackson-databind" % jackson2_version,
  "org.apache.httpcomponents" % "httpclient" % httpclient_version,
  "org.apache.httpcomponents" % "httpasyncclient" % httpasyncclient_version,
//  "org.slf4j" % "slf4j-api" % slf4j_version,
//  "org.slf4j" % "slf4j-log4j12" % slf4j_version,
  "org.apache.commons" % "commons-lang3" % commons_lang3_version,
  "commons-configuration" % "commons-configuration" % commons_configuration_version,
  "commons-cli" % "commons-cli" % commons_cli_version,
  "commons-beanutils" % "commons-beanutils" % commons_beanutils_version,
  "com.hierynomus" % "sshj" % "0.30.0",
  "org.scalacheck"             %% "scalacheck"                     % "1.14.1" % Test
)


// disabled until https://github.com/playframework/playframework/issues/9845 is solved
//scalacOptions ++= List("-encoding", "utf8", "-Xfatal-warnings", "-deprecation")
javacOptions ++= Seq(
  "-Xlint:unchecked",
  "-Xlint:deprecation",
  "-Werror"
) 
