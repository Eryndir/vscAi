import { defineConfig } from "vite";
import scalaJSPlugin from "@scala-js/vite-plugin-scalajs";

export default defineConfig({
  base: 'https://eryndir.github.io/vscAi/',
  plugins: [scalaJSPlugin()],
});
