export interface Post {
  id: number | null;
  header: string,
  content: string,
  author: string,
  creationTimestamp: string | null, // TODO: change to Date later
  updateTimestamp: string | null
}
