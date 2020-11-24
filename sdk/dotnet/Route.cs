// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Mailgun
{
    /// <summary>
    /// Provides a Mailgun Route resource. This can be used to create and manage routes on Mailgun.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Mailgun = Pulumi.Mailgun;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         // Create a new Mailgun route
    ///         var @default = new Mailgun.Route("default", new Mailgun.RouteArgs
    ///         {
    ///             Actions = 
    ///             {
    ///                 "forward('http://example.com/api/v1/foos/')",
    ///                 "stop()",
    ///             },
    ///             Description = "inbound",
    ///             Expression = "match_recipient('.*@foo.example.com')",
    ///             Priority = 0,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Routes can be imported using `ROUTE_ID` and `region` via `import` command. Route ID can be found on Mailgun portal in section `Receiving/Routes`. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).
    /// 
    /// hcl
    /// 
    /// ```sh
    ///  $ pulumi import mailgun:index/route:Route test eu:123456789
    /// ```
    /// </summary>
    public partial class Route : Pulumi.CustomResource
    {
        [Output("actions")]
        public Output<ImmutableArray<string>> Actions { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A filter expression like `match_recipient('.*@gmail.com')`
        /// </summary>
        [Output("expression")]
        public Output<string> Expression { get; private set; } = null!;

        /// <summary>
        /// Smaller number indicates higher priority. Higher priority routes are handled first.
        /// </summary>
        [Output("priority")]
        public Output<int> Priority { get; private set; } = null!;

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Output("region")]
        public Output<string?> Region { get; private set; } = null!;


        /// <summary>
        /// Create a Route resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Route(string name, RouteArgs args, CustomResourceOptions? options = null)
            : base("mailgun:index/route:Route", name, args ?? new RouteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Route(string name, Input<string> id, RouteState? state = null, CustomResourceOptions? options = null)
            : base("mailgun:index/route:Route", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Route resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Route Get(string name, Input<string> id, RouteState? state = null, CustomResourceOptions? options = null)
        {
            return new Route(name, id, state, options);
        }
    }

    public sealed class RouteArgs : Pulumi.ResourceArgs
    {
        [Input("actions", required: true)]
        private InputList<string>? _actions;
        public InputList<string> Actions
        {
            get => _actions ?? (_actions = new InputList<string>());
            set => _actions = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A filter expression like `match_recipient('.*@gmail.com')`
        /// </summary>
        [Input("expression", required: true)]
        public Input<string> Expression { get; set; } = null!;

        /// <summary>
        /// Smaller number indicates higher priority. Higher priority routes are handled first.
        /// </summary>
        [Input("priority", required: true)]
        public Input<int> Priority { get; set; } = null!;

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public RouteArgs()
        {
        }
    }

    public sealed class RouteState : Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<string>? _actions;
        public InputList<string> Actions
        {
            get => _actions ?? (_actions = new InputList<string>());
            set => _actions = value;
        }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A filter expression like `match_recipient('.*@gmail.com')`
        /// </summary>
        [Input("expression")]
        public Input<string>? Expression { get; set; }

        /// <summary>
        /// Smaller number indicates higher priority. Higher priority routes are handled first.
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The region where domain will be created. Default value is `us`.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public RouteState()
        {
        }
    }
}
