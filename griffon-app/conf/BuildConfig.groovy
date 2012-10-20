griffon.project.dependency.resolution = {
    inherits("global")
    log "warn"
    repositories {
        griffonHome()
        mavenCentral()
        mavenRepo 'http://repository.sonatype.org/content/groups/public'
        String basePath = pluginDirPath? "${pluginDirPath}/" : ''
        flatDir name: "lwjglLibDir", dirs: ["${basePath}lib"]
    }
    dependencies {
        compile 'net.alchim31.3rd.org.7-zip:lzma:4.65',
                'org.lwjgl:lwjgl:2.6',
                'org.lwjgl:lwjgl_util:2.6',
                'org.lwjgl:lwjgl_util_applet:2.6',
                'net.java.games:jinput:1.6',
                'com.apple:AppleJavaExtensions:1.4'
    }
}

griffon {
    doc {
        logo = '<a href="http://griffon.codehaus.org" target="_blank"><img alt="The Griffon Framework" src="../img/griffon.png" border="0"/></a>'
        sponsorLogo = "<br/>"
        footer = "<br/><br/>Made with Griffon (@griffon.version@)"
    }
}

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}