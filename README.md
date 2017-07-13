# jikan

Task scheduling and execution service.

Jikan exposes one endpoint, `Schedule`, which takes the following parameters:

* `action` -- the action to take,
* `metadata` -- any additional information for an action (like arguments)
* `schedule` -- The type of scheduling to perform.

Currently supported schedules include:

* `delay` -- after a duration, run the task
* `periodic` -- execute tasks at a constant interval
* `fixed` -- Schedule a task at a given timestamp

The endpoint returns a task id, which can be used to cancel a task in the future.

## Design

Jikan was designed to handle a small amount of tasks that can all fit in memory. This makes the design a lot simpler.
