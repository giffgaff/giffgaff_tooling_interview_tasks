package com.giffgaff.tooling

class Manifest {

    /**
     * Contains the jenkins environment
     */
    def scope

    Manifest(def scope) {
        this.scope = scope
    }

    void logger(def msg) {
        this.scope.echo("[Manifest INFO] ${msg}")
    }

    /*

    Description:
    --------------
    "hasNewArtifactsToDeploy" is a function that state if a deployment should be executed. 
    A deployment should be exeute if a new application OR a new applicaiton version is introduced.
    The function compare 2 objects and return TRUE if at least 1 new artifact needs to be deployed. Otherwise, the function return False.
    The function accept 2 objects (of type "Map"). Each object represent a list of all the applications that needs to be deployed.
    Each entry in the object represent an "Application".
    Each application has a version.
    If an application exist in both objects and the applicaiotn version is different than a new version should be rollout.
    If an application does NOT exist in both objects, than a new application should be deployed.

    Task:
    --------------
    1. Implement the function
    2. [Bonus] Add unit test coverage


    Example of a "manifest":
    ------------------------------
    Map manifest = [
        svc_1: [
            name: "App 1",
            version: "abc_123",
            git_url: "https://github.com/App_1"
        ],
        svc_2: [
            name: "App 2",
            version: "abcd_1234",
            git_url: "https://github.com/App_2"
        ],
        
        ...

        svc_N: [
            name: "App N",
            version: "aaa_1111",
            git_url: "https://github.com/App_N"
        ],
    ]


    Assumptions:
    --------------
    1. Number of applications is unknown
    2. Could be first time deployment ( "rollbackManifest" could be "null")
    3. Not all applications exist in both objects
    4. You can add as many helper functions as you like

    */
    boolean hasNewArtifactsToDeploy(Map manifest, Map rollbackManifest) {
        boolean res = false

        // Code goes here...

        return res
    }

}
