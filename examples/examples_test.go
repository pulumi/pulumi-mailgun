// Copyright 2016-2017, Pulumi Corporation.  All rights reserved.

package examples

import (
	"os"
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

func TestAccRouteTs(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "route"),
		})

	integration.ProgramTest(t, &test)
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions()
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/mailgun",
		},
	})

	return baseJS
}

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions() integration.ProgramTestOptions {
	return integration.ProgramTestOptions{
		ExpectRefreshChanges: true,
		SkipRefresh:          true,
		Quick:                true,
	}
}
