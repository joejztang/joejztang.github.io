# Countdown Timer + Stopwatch

A clean, minimal web app for countdown timers and a stopwatch — built with pure HTML, CSS, and JavaScript. No frameworks, no build tools, just open `index.html` in a browser.

---

## Features

### Countdown Timer

- **Duration input** — set hours, minutes, and seconds (up to 24 hours) using direct number entry or ▲/▼ stepper buttons
- **Quick presets** — one-click shortcuts for 1 min, 5 min, 10 min, 30 min, and 1 hr
- **Digital display** — powered by [simplyCountdown.js](https://vincentloy.github.io/simplyCountdown.js/), showing days / hours / minutes / seconds blocks
- **Analog display** — a smooth SVG clock face with hour, minute, and second hands plus a depleting outer progress ring; updates every 50 ms for fluid animation
- **Digital / Analog tabs** — switch between display modes at any time (analog is the default)
- **Pause / Resume** — freeze the countdown and pick up exactly where you left off
- **Alarm sound** — plays a four-beep alert via the Web Audio API when time runs out (no audio files required)

### Stopwatch

- **Start / Stop / Resume** — toggle with a single button
- **Reset** — clears back to zero
- **Millisecond precision** — displays HH:MM:SS.mmm, updated every 10 ms

### General

- **Close-page guard** — if you try to close or navigate away while a countdown or stopwatch is active (running or paused), the browser prompts for confirmation so you don't lose progress by accident

---

## Usage

No installation or build step required.

1. Clone or download this repository
2. Open `index.html` in any modern browser
3. Select **Countdown Timer** or **Stopwatch** from the top tabs and go

---

## Tech Stack

| Layer | Choice |
|---|---|
| Markup | HTML5 |
| Styling | Plain CSS (no framework) |
| Logic | Vanilla JavaScript |
| Countdown engine | [simplyCountdown.js](https://vincentloy.github.io/simplyCountdown.js/) via CDN |
| Analog clock | SVG + Web Animations API |
| Alarm sound | Web Audio API |

---

## Built with Claude Code

This project was created entirely through [Claude Code](https://claude.ai/code) — Anthropic's official AI coding CLI — without writing a single line of code by hand. Every feature, from the SVG clock face to the Web Audio alarm, was designed, implemented, and refined through conversation with Claude.

---

## License

MIT
