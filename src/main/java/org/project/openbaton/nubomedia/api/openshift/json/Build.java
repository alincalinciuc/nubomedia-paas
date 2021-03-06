package org.project.openbaton.nubomedia.api.openshift.json;

/**
 * Created by maa on 08.10.15.
 */
public class Build {

    private final String kind = "Build";
    private final String apiVersion = "v1";
    private Metadata metadata;
    private BuildSpec spec;
    private BuildStatus status;

    public static class BuildSpec{

        String serviceAccount;
        Source source;
        DockerBuildStrategy strategy;
        Output output;

        public BuildSpec(String serviceAccount, Source source, DockerBuildStrategy strategy, Output output) {
            this.serviceAccount = serviceAccount;
            this.source = source;
            this.strategy = strategy;
            this.output = output;
        }

        public BuildSpec() {
        }

        public String getServiceAccount() {
            return serviceAccount;
        }

        public void setServiceAccount(String serviceAccount) {
            this.serviceAccount = serviceAccount;
        }

        public Source getSource() {
            return source;
        }

        public void setSource(Source source) {
            this.source = source;
        }

        public DockerBuildStrategy getStrategy() {
            return strategy;
        }

        public void setStrategy(DockerBuildStrategy strategy) {
            this.strategy = strategy;
        }

        public Output getOutput() {
            return output;
        }

        public void setOutput(Output output) {
            this.output = output;
        }
    }

    public Build() {
    }

    public Build(BuildStatus status, Metadata metadata, BuildSpec spec) {
        this.status = status;
        this.metadata = metadata;
        this.spec = spec;
    }

    public String getKind() {
        return kind;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public BuildSpec getSpec() {
        return spec;
    }

    public void setSpec(BuildSpec spec) {
        this.spec = spec;
    }

    public BuildStatus getStatus() {
        return status;
    }

    public void setStatus(BuildStatus status) {
        this.status = status;
    }
}
