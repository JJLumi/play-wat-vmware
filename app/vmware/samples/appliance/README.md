# Appliance Management API Samples

This directory contains samples for Appliance Management APIs:

### Appliance Health APIs
Sample                                                                      | Description
----------------------------------------------------------------------------|-------------------------------------------------------------------------
vmware.HealthMessages.java                         | Get the health messages for various appliance health items

### Appliance Networking APIs
Sample                                                                      | Description
----------------------------------------------------------------------------|-------------------------------------------------------------------------
vmware.NetworkingWorkflow.java                 | Enable/Disable IPv6, Reset and Get the network information
vmware.DnsDomainWorkflow.java              | Add/Set/List the DNS domains for the appliance
vmware.DnsServersWorkflow.java             | Add/Set/List the DNS servers for the appliance
vmware.HostNameWorkflow.java               | Get/Set the hostname for the appliance
vmware.InterfacesWorkflow.java      | List/Get the interfaces information for the appliance
vmware.IPv4Workflow.java            | Set/Get the IPv4 configuration of a specific interface in the appliance
vmware.IPv6Workflow.java            | Set/Get the IPv6 configuration of a specific interface in the appliance
vmware.ProxyWorkflow.java                | List/Set/Get the proxy information for the appliance
vmware.NoProxyWorkflow.java              | Get/Set the servers with No proxy configuration in the appliance

### Testbed Requirement:
    - 1 vCenter Server