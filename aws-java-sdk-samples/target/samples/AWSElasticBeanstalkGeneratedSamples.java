import com.amazonaws.services.elasticbeanstalk.*;
import com.amazonaws.services.elasticbeanstalk.model.*;

public class AWSElasticBeanstalkGeneratedSamples {
    public void AbortEnvironmentUpdate_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.AbortEnvironmentUpdate
        //TITLE:To abort a deployment
        //DESCRIPTION:The following code aborts a running application version deployment for an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        AbortEnvironmentUpdateRequest request = new AbortEnvironmentUpdateRequest()
                .withEnvironmentName("my-env");
        client.abortEnvironmentUpdate(request);
        //END_SAMPLE
    }

    public void CheckDNSAvailability_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.CheckDNSAvailability
        //TITLE:To check the availability of a CNAME
        //DESCRIPTION:The following operation checks the availability of the subdomain my-cname:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        CheckDNSAvailabilityRequest request = new CheckDNSAvailabilityRequest()
                .withCNAMEPrefix("my-cname");
        CheckDNSAvailabilityResult response = client
                .checkDNSAvailability(request);
        //END_SAMPLE
    }

    public void CreateApplication_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.CreateApplication
        //TITLE:To create a new application
        //DESCRIPTION:The following operation creates a new application named my-app:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        CreateApplicationRequest request = new CreateApplicationRequest()
                .withApplicationName("my-app")
                .withDescription("my application");
        CreateApplicationResult response = client.createApplication(request);
        //END_SAMPLE
    }

    public void CreateApplicationVersion_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.CreateApplicationVersion
        //TITLE:To create a new application
        //DESCRIPTION:The following operation creates a new version (v1) of an application named my-app:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        CreateApplicationVersionRequest request = new CreateApplicationVersionRequest()
                .withApplicationName("my-app")
                .withAutoCreateApplication(true)
                .withDescription("my-app-v1")
                .withProcess(true)
                .withSourceBundle(
                        new S3Location().withS3Bucket("my-bucket").withS3Key(
                                "sample.war")).withVersionLabel("v1");
        CreateApplicationVersionResult response = client
                .createApplicationVersion(request);
        //END_SAMPLE
    }

    public void CreateConfigurationTemplate_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.CreateConfigurationTemplate
        //TITLE:To create a configuration template
        //DESCRIPTION:The following operation creates a configuration template named my-app-v1 from the settings applied to an environment with the id e-rpqsewtp2j:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        CreateConfigurationTemplateRequest request = new CreateConfigurationTemplateRequest()
                .withApplicationName("my-app")
                .withEnvironmentId("e-rpqsewtp2j")
                .withTemplateName("my-app-v1");
        CreateConfigurationTemplateResult response = client
                .createConfigurationTemplate(request);
        //END_SAMPLE
    }

    public void CreateEnvironment_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.CreateEnvironment
        //TITLE:To create a new environment for an application
        //DESCRIPTION:The following operation creates a new environment for version v1 of a java application named my-app:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        CreateEnvironmentRequest request = new CreateEnvironmentRequest()
                .withApplicationName("my-app")
                .withCNAMEPrefix("my-app")
                .withEnvironmentName("my-env")
                .withSolutionStackName(
                        "64bit Amazon Linux 2015.03 v2.0.0 running Tomcat 8 Java 8")
                .withVersionLabel("v1");
        CreateEnvironmentResult response = client.createEnvironment(request);
        //END_SAMPLE
    }

    public void CreateStorageLocation_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.CreateStorageLocation
        //TITLE:To create a new environment for an application
        //DESCRIPTION:The following operation creates a new environment for version v1 of a java application named my-app:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        CreateStorageLocationRequest request = new CreateStorageLocationRequest();
        CreateStorageLocationResult response = client
                .createStorageLocation(request);
        //END_SAMPLE
    }

    public void DeleteApplication_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DeleteApplication
        //TITLE:To delete an application
        //DESCRIPTION:The following operation deletes an application named my-app:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DeleteApplicationRequest request = new DeleteApplicationRequest()
                .withApplicationName("my-app");
        client.deleteApplication(request);
        //END_SAMPLE
    }

    public void DeleteApplicationVersion_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DeleteApplicationVersion
        //TITLE:To delete an application version
        //DESCRIPTION:The following operation deletes an application version named 22a0-stage-150819_182129 for an application named my-app:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DeleteApplicationVersionRequest request = new DeleteApplicationVersionRequest()
                .withApplicationName("my-app").withDeleteSourceBundle(true)
                .withVersionLabel("22a0-stage-150819_182129");
        client.deleteApplicationVersion(request);
        //END_SAMPLE
    }

    public void DeleteConfigurationTemplate_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DeleteConfigurationTemplate
        //TITLE:To delete a configuration template
        //DESCRIPTION:The following operation deletes a configuration template named my-template for an application named my-app:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DeleteConfigurationTemplateRequest request = new DeleteConfigurationTemplateRequest()
                .withApplicationName("my-app").withTemplateName("my-template");
        client.deleteConfigurationTemplate(request);
        //END_SAMPLE
    }

    public void DeleteEnvironmentConfiguration_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DeleteEnvironmentConfiguration
        //TITLE:To delete a draft configuration
        //DESCRIPTION:The following operation deletes a draft configuration for an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DeleteEnvironmentConfigurationRequest request = new DeleteEnvironmentConfigurationRequest()
                .withApplicationName("my-app").withEnvironmentName("my-env");
        client.deleteEnvironmentConfiguration(request);
        //END_SAMPLE
    }

    public void DescribeApplicationVersions_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DescribeApplicationVersions
        //TITLE:To view information about an application version
        //DESCRIPTION:The following operation retrieves information about an application version labeled v2:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DescribeApplicationVersionsRequest request = new DescribeApplicationVersionsRequest()
                .withApplicationName("my-app").withVersionLabels("v2");
        DescribeApplicationVersionsResult response = client
                .describeApplicationVersions(request);
        //END_SAMPLE
    }

    public void DescribeApplications_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DescribeApplications
        //TITLE:To view a list of applications
        //DESCRIPTION:The following operation retrieves information about applications in the current region:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DescribeApplicationsRequest request = new DescribeApplicationsRequest();
        DescribeApplicationsResult response = client
                .describeApplications(request);
        //END_SAMPLE
    }

    public void DescribeConfigurationOptions_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DescribeConfigurationOptions
        //TITLE:To view configuration options for an environment
        //DESCRIPTION:The following operation retrieves descriptions of all available configuration options for an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DescribeConfigurationOptionsRequest request = new DescribeConfigurationOptionsRequest()
                .withApplicationName("my-app").withEnvironmentName("my-env");
        DescribeConfigurationOptionsResult response = client
                .describeConfigurationOptions(request);
        //END_SAMPLE
    }

    public void DescribeConfigurationSettings_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DescribeConfigurationSettings
        //TITLE:To view configurations settings for an environment
        //DESCRIPTION:The following operation retrieves configuration settings for an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DescribeConfigurationSettingsRequest request = new DescribeConfigurationSettingsRequest()
                .withApplicationName("my-app").withEnvironmentName("my-env");
        DescribeConfigurationSettingsResult response = client
                .describeConfigurationSettings(request);
        //END_SAMPLE
    }

    public void DescribeEnvironmentHealth_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DescribeEnvironmentHealth
        //TITLE:To view environment health
        //DESCRIPTION:The following operation retrieves overall health information for an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DescribeEnvironmentHealthRequest request = new DescribeEnvironmentHealthRequest()
                .withAttributeNames("All").withEnvironmentName("my-env");
        DescribeEnvironmentHealthResult response = client
                .describeEnvironmentHealth(request);
        //END_SAMPLE
    }

    public void DescribeEnvironmentResources_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DescribeEnvironmentResources
        //TITLE:To view information about the AWS resources in your environment
        //DESCRIPTION:The following operation retrieves information about resources in an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DescribeEnvironmentResourcesRequest request = new DescribeEnvironmentResourcesRequest()
                .withEnvironmentName("my-env");
        DescribeEnvironmentResourcesResult response = client
                .describeEnvironmentResources(request);
        //END_SAMPLE
    }

    public void DescribeEnvironments_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DescribeEnvironments
        //TITLE:To view information about an environment
        //DESCRIPTION:The following operation retrieves information about an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DescribeEnvironmentsRequest request = new DescribeEnvironmentsRequest()
                .withEnvironmentNames("my-env");
        DescribeEnvironmentsResult response = client
                .describeEnvironments(request);
        //END_SAMPLE
    }

    public void DescribeEvents_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DescribeEvents
        //TITLE:To view events for an environment
        //DESCRIPTION:The following operation retrieves events for an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DescribeEventsRequest request = new DescribeEventsRequest()
                .withEnvironmentName("my-env");
        DescribeEventsResult response = client.describeEvents(request);
        //END_SAMPLE
    }

    public void DescribeInstancesHealth_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.DescribeInstancesHealth
        //TITLE:To view environment health
        //DESCRIPTION:The following operation retrieves health information for instances in an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        DescribeInstancesHealthRequest request = new DescribeInstancesHealthRequest()
                .withAttributeNames("All").withEnvironmentName("my-env");
        DescribeInstancesHealthResult response = client
                .describeInstancesHealth(request);
        //END_SAMPLE
    }

    public void ListAvailableSolutionStacks_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.ListAvailableSolutionStacks
        //TITLE:To view solution stacks
        //DESCRIPTION:The following operation lists solution stacks for all currently available platform configurations and any that you have used in the past:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        ListAvailableSolutionStacksRequest request = new ListAvailableSolutionStacksRequest();
        ListAvailableSolutionStacksResult response = client
                .listAvailableSolutionStacks(request);
        //END_SAMPLE
    }

    public void RebuildEnvironment_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.RebuildEnvironment
        //TITLE:To rebuild an environment
        //DESCRIPTION:The following operation terminates and recreates the resources in an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        RebuildEnvironmentRequest request = new RebuildEnvironmentRequest()
                .withEnvironmentName("my-env");
        client.rebuildEnvironment(request);
        //END_SAMPLE
    }

    public void RequestEnvironmentInfo_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.RequestEnvironmentInfo
        //TITLE:To request tailed logs
        //DESCRIPTION:The following operation requests logs from an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        RequestEnvironmentInfoRequest request = new RequestEnvironmentInfoRequest()
                .withEnvironmentName("my-env").withInfoType("tail");
        client.requestEnvironmentInfo(request);
        //END_SAMPLE
    }

    public void RestartAppServer_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.RestartAppServer
        //TITLE:To restart application servers
        //DESCRIPTION:The following operation restarts application servers on all instances in an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        RestartAppServerRequest request = new RestartAppServerRequest()
                .withEnvironmentName("my-env");
        client.restartAppServer(request);
        //END_SAMPLE
    }

    public void RetrieveEnvironmentInfo_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.RetrieveEnvironmentInfo
        //TITLE:To retrieve tailed logs
        //DESCRIPTION:The following operation retrieves a link to logs from an environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        RetrieveEnvironmentInfoRequest request = new RetrieveEnvironmentInfoRequest()
                .withEnvironmentName("my-env").withInfoType("tail");
        RetrieveEnvironmentInfoResult response = client
                .retrieveEnvironmentInfo(request);
        //END_SAMPLE
    }

    public void SwapEnvironmentCNAMEs_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.SwapEnvironmentCNAMEs
        //TITLE:To swap environment CNAMES
        //DESCRIPTION:The following operation swaps the assigned subdomains of two environments:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        SwapEnvironmentCNAMEsRequest request = new SwapEnvironmentCNAMEsRequest()
                .withDestinationEnvironmentName("my-env-green")
                .withSourceEnvironmentName("my-env-blue");
        client.swapEnvironmentCNAMEs(request);
        //END_SAMPLE
    }

    public void TerminateEnvironment_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.TerminateEnvironment
        //TITLE:To terminate an environment
        //DESCRIPTION:The following operation terminates an Elastic Beanstalk environment named my-env:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        TerminateEnvironmentRequest request = new TerminateEnvironmentRequest()
                .withEnvironmentName("my-env");
        TerminateEnvironmentResult response = client
                .terminateEnvironment(request);
        //END_SAMPLE
    }

    public void UpdateApplication_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.UpdateApplication
        //TITLE:To change an application's description
        //DESCRIPTION:The following operation updates the description of an application named my-app:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        UpdateApplicationRequest request = new UpdateApplicationRequest()
                .withApplicationName("my-app").withDescription(
                        "my Elastic Beanstalk application");
        UpdateApplicationResult response = client.updateApplication(request);
        //END_SAMPLE
    }

    public void UpdateApplicationVersion_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.UpdateApplicationVersion
        //TITLE:To change an application version's description
        //DESCRIPTION:The following operation updates the description of an application version named 22a0-stage-150819_185942:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        UpdateApplicationVersionRequest request = new UpdateApplicationVersionRequest()
                .withApplicationName("my-app")
                .withDescription("new description")
                .withVersionLabel("22a0-stage-150819_185942");
        UpdateApplicationVersionResult response = client
                .updateApplicationVersion(request);
        //END_SAMPLE
    }

    public void UpdateConfigurationTemplate_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.UpdateConfigurationTemplate
        //TITLE:To update a configuration template
        //DESCRIPTION:The following operation removes the configured CloudWatch custom health metrics configuration ConfigDocument from a saved configuration template named my-template:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        UpdateConfigurationTemplateRequest request = new UpdateConfigurationTemplateRequest()
                .withApplicationName("my-app")
                .withOptionsToRemove(
                        new OptionSpecification().withNamespace(
                                "aws:elasticbeanstalk:healthreporting:system")
                                .withOptionName("ConfigDocument"))
                .withTemplateName("my-template");
        UpdateConfigurationTemplateResult response = client
                .updateConfigurationTemplate(request);
        //END_SAMPLE
    }

    public void UpdateEnvironment_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.UpdateEnvironment
        //TITLE:To update an environment to a new version
        //DESCRIPTION:The following operation updates an environment named "my-env" to version "v2" of the application to which it belongs:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        UpdateEnvironmentRequest request = new UpdateEnvironmentRequest()
                .withEnvironmentName("my-env").withVersionLabel("v2");
        UpdateEnvironmentResult response = client.updateEnvironment(request);
        //END_SAMPLE
    }

    public void UpdateEnvironment_2() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.UpdateEnvironment
        //TITLE:To configure option settings
        //DESCRIPTION:The following operation configures several options in the aws:elb:loadbalancer namespace:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        UpdateEnvironmentRequest request = new UpdateEnvironmentRequest()
                .withEnvironmentName("my-env").withOptionSettings(
                        new ConfigurationOptionSetting()
                                .withNamespace("aws:elb:healthcheck")
                                .withOptionName("Interval").withValue("15"),
                        new ConfigurationOptionSetting()
                                .withNamespace("aws:elb:healthcheck")
                                .withOptionName("Timeout").withValue("8"),
                        new ConfigurationOptionSetting()
                                .withNamespace("aws:elb:healthcheck")
                                .withOptionName("HealthyThreshold")
                                .withValue("2"),
                        new ConfigurationOptionSetting()
                                .withNamespace("aws:elb:healthcheck")
                                .withOptionName("UnhealthyThreshold")
                                .withValue("3"));
        UpdateEnvironmentResult response = client.updateEnvironment(request);
        //END_SAMPLE
    }

    public void ValidateConfigurationSettings_1() {
        //BEGIN_SAMPLE:AWSElasticBeanstalk.ValidateConfigurationSettings
        //TITLE:To validate configuration settings
        //DESCRIPTION:The following operation validates a CloudWatch custom metrics config document:
        AWSElasticBeanstalk client = new AWSElasticBeanstalkClient();
        ValidateConfigurationSettingsRequest request = new ValidateConfigurationSettingsRequest()
                .withApplicationName("my-app")
                .withEnvironmentName("my-env")
                .withOptionSettings(
                        new ConfigurationOptionSetting()
                                .withNamespace(
                                        "aws:elasticbeanstalk:healthreporting:system")
                                .withOptionName("ConfigDocument")
                                .withValue(
                                        "{\"CloudWatchMetrics\": {\"Environment\": {\"ApplicationLatencyP99.9\": null,\"InstancesSevere\": 60,\"ApplicationLatencyP90\": 60,\"ApplicationLatencyP99\": null,\"ApplicationLatencyP95\": 60,\"InstancesUnknown\": 60,\"ApplicationLatencyP85\": 60,\"InstancesInfo\": null,\"ApplicationRequests2xx\": null,\"InstancesDegraded\": null,\"InstancesWarning\": 60,\"ApplicationLatencyP50\": 60,\"ApplicationRequestsTotal\": null,\"InstancesNoData\": null,\"InstancesPending\": 60,\"ApplicationLatencyP10\": null,\"ApplicationRequests5xx\": null,\"ApplicationLatencyP75\": null,\"InstancesOk\": 60,\"ApplicationRequests3xx\": null,\"ApplicationRequests4xx\": null},\"Instance\": {\"ApplicationLatencyP99.9\": null,\"ApplicationLatencyP90\": 60,\"ApplicationLatencyP99\": null,\"ApplicationLatencyP95\": null,\"ApplicationLatencyP85\": null,\"CPUUser\": 60,\"ApplicationRequests2xx\": null,\"CPUIdle\": null,\"ApplicationLatencyP50\": null,\"ApplicationRequestsTotal\": 60,\"RootFilesystemUtil\": null,\"LoadAverage1min\": null,\"CPUIrq\": null,\"CPUNice\": 60,\"CPUIowait\": 60,\"ApplicationLatencyP10\": null,\"LoadAverage5min\": null,\"ApplicationRequests5xx\": null,\"ApplicationLatencyP75\": 60,\"CPUSystem\": 60,\"ApplicationRequests3xx\": 60,\"ApplicationRequests4xx\": null,\"InstanceHealth\": null,\"CPUSoftirq\": 60}},\"Version\": 1}"));
        ValidateConfigurationSettingsResult response = client
                .validateConfigurationSettings(request);
        //END_SAMPLE
    }
}
