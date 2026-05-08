import java.time.LocalDateTime

plugins {
    id("net.neoforged.moddev.legacyforge") version "2.0.141"
}

group = "com.seleneandmana.compatoplenty"
base.archivesName = "Compat-O-Plenty"

java.toolchain.languageVersion = JavaLanguageVersion.of(17)

val modId = "compatoplenty"

legacyForge {
    version = "1.20.1-47.1.3"

    parchment {
        mappingsVersion = "2023.09.03"
        minecraftVersion = "1.20.1"
    }

    mods.create(modId) {
        sourceSet(sourceSets.main.get())
    }

    runs {
        create("client") {
            client()
        }

        create("server") {
            server()
        }

        create("data") {
            data()
            programArguments.addAll(
                "--all",
                "--mod", modId,
                "--output", file("src/generated/resources/").path,
                "--existing", file("src/main/resources/").path,
                "--existing-mod", "biomesoplenty",
                "--existing-mod", "quark",
                "--existing-mod", "blueprint"
            )
        }

        forEach {
            it.gameDirectory = project.file("run")
            it.programArguments.addAll("forge.logging.markers", "REGISTRIES")
            it.programArguments.addAll("forge.logging.console.level", "debug")
        }
    }
}

sourceSets.main {
    resources.srcDir("src/generated/resources")
}

dependencies {
    modImplementation("com.teamabnormals:blueprint:1.20.1-7.1.0")
    modImplementation("curse.maven:bop-220318:4764804")
    modImplementation("curse.maven:farmersdelight-398521:5051242")
    modImplementation("com.teamabnormals:boatload:1.20.1-5.0.1")
    modImplementation("curse.maven:woodworks-543610:5292418")
    modImplementation("curse.maven:clayworks-592162:5302012")
    modCompileOnly("curse.maven:vertical-slabs-compat-724387:5022329")
    modImplementation("curse.maven:selene-499980:5478857")
    modImplementation("curse.maven:quark-243121:5418252")
    modImplementation("curse.maven:zeta-968868:5418213")
    modImplementation("curse.maven:twigs-496913:4998195")

    modRuntimeOnly("curse.maven:terrablender-563928:5378180")

    modRuntimeOnly("curse.maven:jei-238222:5419575")
}

repositories {
    maven {
        url = uri("https://cursemaven.com")
        content {
            includeGroup("curse.maven")
        }
    }
    maven {
        url = uri("https://maven.teamabnormals.com")
    }
}

tasks.withType<ProcessResources> {
    // this will ensure that this task is redone when the versions change.
    inputs.property("version", version)

    filesMatching("META-INF/mods.toml") {
        expand(
            mapOf(
                "version" to version,
            )
        )
    }
}

tasks.jar {
    manifest {
        attributes(
            mapOf(
                "Specification-Title" to "Compat O' Plenty",
                "Specification-Vendor" to "Selene and Mana",
                "Specification-Version" to "1",
                "Implementation-Title" to "Compat O' Plenty",
                "Implementation-Version" to project.version,
                "Implementation-Vendor" to "Selene and Mana",
                "Implementation-Timestamp" to LocalDateTime.now().toString()
            )
        )
    }
}